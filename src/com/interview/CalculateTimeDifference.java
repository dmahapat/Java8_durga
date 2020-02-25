package com.interview;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class CalculateTimeDifference {
	
	public static void main(String[] args) {
		//String fileName = "c://lines.txt";
		String fileName = "C:\\ReadFile//idsengine_VHQJobMonitor_ip-10-79-216-219.ec2.internal_2020-02-10.log";
		final List<String> list = new ArrayList<String>();
		
		try(Stream<Path> paths = Files.walk(Paths.get("C:\\ReadFile"))){
			
			paths.forEach(filePath -> {
				List<String> fileContent = new ArrayList<>();
				Stream<String> lines;
				try {
					if(Files.isRegularFile(filePath)) {
						lines = Files.lines(filePath);
						fileContent =  lines
								.filter(s->s.contains("/apis/v1.1/downloads?since="))
								.map(String::toUpperCase)
								.map(s->s.substring(s.indexOf("HTTPS")))
								.distinct()
								.map(s->s.substring(s.indexOf("SINCE="),s.indexOf("&")))
								.map(s->s.substring(s.indexOf("=")+1,s.indexOf("Z")))
								.collect(Collectors.toList());
						list.addAll(fileContent);	
						System.out.println(fileContent.size()+" ********************************* "+list.size());
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		list.forEach(System.out::println);
		
/*		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			//1. filter line 3
			//2. convert all content to upper case
			//3. convert it into a List
			list = stream
					.filter(s->s.contains("/apis/v1.1/downloads?since="))
					.map(String::toUpperCase)
					.map(s->s.substring(s.indexOf("HTTPS")))
					.distinct()
					.map(s->s.substring(s.indexOf("SINCE="),s.indexOf("&")))
					.map(s->s.substring(s.indexOf("=")+1,s.indexOf("Z")))
					.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Extracted data from log file in string format");
		list.forEach(System.out::println);

		List<LocalDateTime> collect = list.stream()
		    .map(s->LocalDateTime.parse(s))
		    .collect(Collectors.toList());
		System.out.println("Data converted to LOCALDATETIME:");
		collect.forEach(System.out::println);
		
		System.out.println("DIFFERENCES:");
		LongStream.range(0, collect.size()-1)
		         .map(i->ChronoUnit.HOURS.between(collect.get((int) (i)), collect.get((int) (i+1))))
		         .forEach(System.out::println);*/
	}
	
}
