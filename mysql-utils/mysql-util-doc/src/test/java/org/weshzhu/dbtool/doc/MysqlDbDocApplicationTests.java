package org.weshzhu.dbtool.doc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.weshzhu.dbtool.common.entity.Tables;
import org.weshzhu.dbtool.doc.service.TableService;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MysqlDbDocApplicationTests {

	@Autowired
	private TableService tableService;
	@Test
	public void generateDBDesignDoc() {
		try {
			List<Tables> tables = tableService.getTablesBySchemaName("pboc");

			tables.forEach(table -> {
				System.out.println(table.getTableName());
			});

		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
