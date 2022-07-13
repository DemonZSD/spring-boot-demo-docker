package org.weshzhu.dbtool.doc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.weshzhu.dbtool.common.entity.Table;
import org.weshzhu.dbtool.doc.dao.TableDao;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author  zhushidong
 *
 */
@Service("tableService")
public class TablesServiceImpl implements TableService{

    Logger logger = LoggerFactory.getLogger(TablesServiceImpl.class);

    @Resource
    private TableDao tableDao;

    @Override
    public Map<String, List<Table>> getTablesBySchemaNames(String... schemaNames) throws Exception {

        Map<String, List<Table>> tablesMap = new HashMap<>();
        List<Table> tableList;

        for (String schema: schemaNames) {
            tableList = tableDao.queryAllBySchema(schema);
            tablesMap.put(schema, tableList);
        }
        logger.info("查询出表清单: {}", tablesMap);
        return tablesMap;
    }

    @Override
    public Map<String, Table> getTablesBySchemaName(String schemaName) throws Exception {
        Map<String, Table> tablesMap = new HashMap<>();

        List<Table> tableList = tableDao.queryAllBySchema(schemaName);

        tableList.forEach(table -> {
            tablesMap.put(table.getTableName(), table);
        });

        return tablesMap;
    }
}
