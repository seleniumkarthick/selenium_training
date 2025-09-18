package com.selenium;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SampleTest {

    public static void main(String[] args) {
    	
    	SampleTest obj=new SampleTest();
    	obj.readRowValueForGivenInput();
    	
    	
    }
    
    
    public void readRowValueForGivenInput() {
    	
    	

        String excelFilePath = "C:\\Users\\User\\Desktop\\Sample.xlsx";  // <-- Change path to your Excel file
       
        System.out.print("Enter Investor ID: ");
        String inputInvestorId = "PA1";

        List<String> accountSegmentList = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming first sheet
            int rowCount = sheet.getLastRowNum();

            // Loop through rows (skip header = start from row 1)
            for (int i = 1; i <= rowCount; i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;

                // Read cells (column indexes based on table)
                Cell investorIdCell = row.getCell(1);      // investorid column
                Cell accountSegmentCell = row.getCell(3);  // accountsegmentid column
                Cell statusCell = row.getCell(4);          // datausedstatus column

                String investorId = investorIdCell != null ? investorIdCell.toString().trim() : "";
                String accountSegmentId = accountSegmentCell != null ? accountSegmentCell.toString().trim() : "";
                String dataUsedStatus = statusCell != null ? statusCell.toString().trim() : "";

                // Check condition: matching investorid + status not Used
                if (investorId.equalsIgnoreCase(inputInvestorId) &&
                        (dataUsedStatus.isEmpty() || !dataUsedStatus.equalsIgnoreCase("Used"))) {
                    accountSegmentList.add(accountSegmentId);
                }
            }

            // Print results
            if (accountSegmentList.isEmpty()) {
                System.out.println("No available accountSegmentId found for Investor ID: " + inputInvestorId);
            } else {
                System.out.println("Available accountSegmentIds for Investor " + inputInvestorId + ": " + accountSegmentList);
               // System.out.println("First available accountSegmentId: " + accountSegmentList.get(0));
            }

        } catch (IOException e) {
            System.out.println("Error reading Excel file: " + e.getMessage());
        }
    
    	
    	
    }
}
