package com.ws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WeatherApp {
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles1\\weather_data1.json");
		Object obj= jsonparser.parse(reader);
		JSONObject weather=(JSONObject)obj;
		   Scanner scanner = new Scanner(System.in);
		        int choice;

		        do {
		            displayMenu();
		            choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    handleWeatherOption(scanner);
		                    break;
		                case 2:
		                    handleWindSpeedOption(scanner);
		                    break;
		                case 3:
		                    handlePressureOption(scanner);
		                    break;
		                case 0:
		                    System.out.println("Exiting the program.");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        } while (choice != 0);

		        scanner.close();
		    }

		    private static void displayMenu() {
		        System.out.println("Select an option:");
		        System.out.println("1. Get weather");
		        System.out.println("2. Get Wind Speed");
		        System.out.println("3. Get Pressure");
		        System.out.println("0. Exit");
		    }

		    
		    private static void handleWeatherOption(Scanner scanner) {
		        System.out.print("Enter the date: ");
		        String date = scanner.next();
		        double temperature = getTemperatureForDate(date);
		        System.out.println("Temperature for " + date + ": " + temperature + " °C");
		    }

		    

		    private static void handleWindSpeedOption(Scanner scanner) {
		        System.out.print("Enter the date: ");
		        String date = scanner.next();
		        double windSpeedData = getWindSpeedDetails(date);
		        System.out.println("Wind speed details for " + date + ": " + windSpeedData + " mph");
		    }

		    private static void handlePressureOption(Scanner scanner) {
		        System.out.print("Enter the date: ");
		        String date = scanner.next();
		         double pressureData = getPressureDetails(date);
		        System.out.println("Pressure details for " + date + ": " + pressureData + " hPa");
		    }

		     
		    private static double getTemperatureForDate(String date) {
		         return 25.0;
		     }

		    private static double getWindSpeedDetails(String date) {
		         return 37.0;
		         }

		     private static double getPressureDetails(String date) {
		        return 17.07; 
		        }
		

	}

