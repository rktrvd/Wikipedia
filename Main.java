package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.wikipedia.org");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//strong[contains(text(),'English')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");
        driver.findElement(By.id("searchButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='searchmatch']")).click();
        Thread.sleep(2000);
        Robot robot=new Robot();
        robot.mouseWheel(15);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@title='Edit section: History']")).click();
        Thread.sleep(4000);
        robot.keyPress(27);
        robot.keyRelease(27);
        Thread.sleep(4000);

        driver.close();



    }
}
