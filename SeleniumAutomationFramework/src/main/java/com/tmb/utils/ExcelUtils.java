package com.tmb.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.tmb.constants.FrameworkConstants;

public final class ExcelUtils {

	private ExcelUtils() {}

	public static List<Map<String,String>> getTestDetails(String sheetname){
		List<Map<String,String>> list = null;
		
		FileInputStream fs = null;
		try{

			fs = new FileInputStream(FrameworkConstants.getExcelpath());
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(sheetname);
			
			DataFormatter formatter = new DataFormatter();
			
			int lastrownum = sheet.getLastRowNum();
			int lastcolnum = sheet.getRow(0).getLastCellNum();

			Map<String, String> map = null;
			list = new ArrayList<>();
			
			for(int i=1;i<=lastrownum;i++){
				map = new HashMap<>();
				for(int j=0;j<lastcolnum;j++) {
					String key = sheet.getRow(0).getCell(j).getStringCellValue();
//					String value = sheet.getRow(i).getCell(j).getStringCellValue();					
					String value = formatter.formatCellValue(sheet.getRow(i).getCell(j));			

					map.put(key, value);
				}
				list.add(map);
			}
		}catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(Objects.nonNull(fs)) {
					fs.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
