package org.weshzhu.dbtool.doc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.weshzhu.dbtool.common.entity.Columns;
import org.weshzhu.dbtool.common.entity.Table;
import org.weshzhu.dbtool.doc.service.ColumnsService;
import org.weshzhu.dbtool.doc.service.TableService;

import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MysqlDbDocApplicationTests {

	@Autowired
	private TableService tableService;

	@Autowired
	private ColumnsService columnsService;
	@Test
	public void generateDBDesignDoc() {
		try {

			Map<String,List<Table>> tablesMap = tableService.getTablesBySchemaNames("pboc");

			List<Columns> columnsList = columnsService.queryBySchema("pboc");

			columnsList.forEach(column -> {
				System.out.printf(String.format("schema=%s, table=%s, column=%s", column.getTableSchema(), column.getTableName(), column.getColumnName()));
			});
//			tablesMap.forEach((key, tablesList) -> {
//				for (Table table : tablesList) {
//					System.out.println(table.getTableName());
//				}
//			});



		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
