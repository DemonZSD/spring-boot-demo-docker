package org.weshzhu.dbtool.doc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.weshzhu.dbtool.common.entity.Columns;
import org.weshzhu.dbtool.common.entity.Table;
import org.weshzhu.dbtool.doc.service.ColumnsService;
import org.weshzhu.dbtool.doc.service.GenerateExcelService;
import org.weshzhu.dbtool.doc.service.TableService;

import java.util.List;
import java.util.Map;

/**
 * @author zhushidong
 */
@Service("generateExcelService")
public class GenerateExcelServiceImpl implements GenerateExcelService {

    @Autowired
    private ColumnsService columnsService;
    @Autowired
    private TableService tableService;
    @Override
    public void generateExcel(String fileName, String schemaName) throws Exception {

        Map<String, Table> tablesMap = tableService.getTablesBySchemaName(schemaName);
        List<Columns> columns = columnsService.queryBySchema(schemaName);

        

    }
}
