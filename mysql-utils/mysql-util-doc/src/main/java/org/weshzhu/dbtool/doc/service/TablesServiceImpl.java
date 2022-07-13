package org.weshzhu.dbtool.doc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.weshzhu.dbtool.common.entity.Tables;
import org.weshzhu.dbtool.doc.dao.TablesDao;

import javax.annotation.Resource;
import java.util.List;

@Service("tableService")
public class TablesServiceImpl implements TableService{

    Logger logger = LoggerFactory.getLogger(TablesServiceImpl.class);

    @Resource
    private TablesDao tablesDao;

    @Override
    public List<Tables> getTablesBySchemaName(String schemaName) throws Exception {

        List<Tables> tables = tablesDao.queryAllBySchema(schemaName);
        logger.info("查询出表清单:", tables);
        return null;
    }
}
