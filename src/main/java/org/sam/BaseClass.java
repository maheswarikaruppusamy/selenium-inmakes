package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Scrollable;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	public static WebDriver driver;
	public static void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
	public static void windowMaximize() {
		driver.manage().window().maximize();

	}
	public static void lauchUrl(String url) {
		driver.get(url);;

	}
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	public static void pageUrl() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);

	}
	public static void passtxt(String object,WebElement ele) {
		ele.sendKeys(object);

	}
	public static void closeEntrireBrowser() {
		driver.quit();

	}
	public static void clickBtn(WebElement ele) {
		ele.click();

	}
	public static void screenShot(String imgnme) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("location+imgnme.png");
		FileUtils.copyFile(f, image);

	}
	public static Actions a;
	
	public static void movetheCurser(WebElement trgtele) {
		a=new Actions(driver);
		a.moveToElement(trgtele).perform();

	}
	public static void dradrop(WebElement dragele,WebElement dropele) {
		a=new Actions(driver);
		a.dragAndDrop(dragele, dropele).perform();

	}
	
	public static JavascriptExecutor js;
	public static void scrollthepage(WebElement tarele) {
		js=(JavascriptExecutor)driver;
        js.executeAsyncScript("arguments[0].scrollintoview(true)", tarele);
	}
	public static void scroll(WebElement ele) {
		js=(JavascriptExecutor)driver;
		js.executeScript("argumnets[0].scrollintoview(false)", ele);

	}
	public static void excelRead(String sheetnme,int rownum,int cellnum) throws IOException {
		File f=new File("ecellocation.png");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("datas");
		Row r = s.getRow(rownum);
		Cell c = r.getCell(cellnum);
		int cellType = c.getCellType();
		String value=" ";
		if (cellType==1) {
			String val = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat sm=new SimpleDateFormat(value);
			String val1 = sm.format(dd);
		}
		else {
			double d = c.getNumericCellValue();
			long l=(long)d;
			String valueOf = String.valueOf(l);
		}
		}
	public static void createnewExcelfile(String writedata,int rownum,int cellnum) throws IOException {
		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\FrameWorksExample\\Excel\\courses.xlsx");
		Workbook wb=new XSSFWorkbook();
		Sheet s = wb.createSheet("datas");
		Row r= s.createRow(rownum);
		Cell c = r.createCell(cellnum);
		c.setCellValue(writedata);
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);

	}
	public static void createRow(String newdata,int crerow,int crecell) throws IOException {
		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\FrameWorksExample\\Excel\\courses.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("datas");
		Row r = s.createRow(crerow);
		Cell c = r.createCell(crecell);
		c.setCellValue(newdata);
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		

	}
	public static void createCell( String newdata,int getrow,int crecell) throws IOException {
		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\FrameWorksExample\\Excel\\courses.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("datas");
		Row r= s.getRow(getrow);
		Cell c = r.createCell(crecell);
		c.setCellValue(newdata);
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);

	}
	
	public static void updateDatetoParticularcell(String existdata,String newdata,int getrow,int getcell) throws IOException {
		File f=new File("excel file.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s = wb.getSheet(newdata);
		Row r = s.getRow(getcell);
		Cell c = r.getCell(getcell);
		String str = c.getStringCellValue();
		if (str.equals(existdata)) {
			c.setCellValue(newdata);
		}
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);

	}
	
	}
