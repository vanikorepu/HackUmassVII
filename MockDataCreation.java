package savePaper;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 


public class MockDataCreation{
	private static int id;


	public static void main(String[] args) {
		int number = 50;
		DataEntry students[] = new DataEntry[number];
		int sortedThisMonth[] = new int[number];
		int sortedThisYear[] = new int[number];
		int sortedByDiff[] = new int[number];
		for(int i = 0; i < number; i++) {

			DataEntry d = new DataEntry(30000000 + i);
			students[i] = d;
			sortedThisMonth[i] = d.thisMonth;
			sortedThisYear[i] = d.thisYear;
			sortedByDiff[i] = d.thisMonth - d.prevMonth;
		}
		for (int i = 0; i < number; i++) {
			//System.out.println(students[i].ID + " " + students[i].thisMonth + " " + students[i].prevMonth + " " + students[i].thisYear);
		}
		
//		Arrays.sort(sortedThisMonth);
//		System.out.println(Arrays.toString(sortedThisMonth));
//		Arrays.sort(sortedThisYear);
//		System.out.println(Arrays.toString(sortedThisYear));
//		Arrays.sort(sortedByDiff);
//		System.out.println(Arrays.toString(sortedByDiff));
		final int[] ID = new int[1];
		final JFrame frame = new JFrame();
	    frame.setSize(800, 700);
		JLabel label = new JLabel("Enter Student ID", JLabel.CENTER);
		//frame.add(label);
		JTextField t = new JTextField(10);
		JButton b = new JButton("Enter");
		JPanel p = new JPanel();
		p.add(t);
		p.add(b);
		p.add(label);
		frame.add(p);
		frame.setVisible(true);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id = Integer.parseInt(t.getText());
				System.out.println(id);
				int rank = 0;
				double trees = 0.0;
				int diff = 0, cnt = 0;
				Arrays.sort(students, new SortByThisMonth());
				for(int i = 0; i < number; i++) {
					System.out.print(students[i].thisMonth + " ");
					if(id == students[i].ID) {
						rank = rank + i + 1;
						trees = students[i].thisMonth/100.0;
					}
				}
				System.out.print("\n");
				Arrays.sort(students, new SortByThisYear());
				for(int i = 0; i < number; i++) {
					System.out.print(students[i].thisYear + " ");
					if(id == students[i].ID)
						rank = rank + i + 1;
				}
				System.out.print("\n");
				Arrays.sort(students, new SortByDiff());
				for(int i = 0; i < number; i++) {
					System.out.print(students[i].thisMonth - students[i].prevMonth + " ");
					if(id == students[i].ID) {
						rank = rank + i + 1;
						diff = students[i].thisMonth - students[i].prevMonth;
						cnt = students[i].prevMonth;
					}
				}
				System.out.print("\n");
				rank = rank/3;
				System.out.println(rank);
				System.out.println(number*100-rank*100);
				String s1 = "Your rank is " + rank + "! \n You have earned " + (number*100-rank*100) + " points!";
				String s2 = "\nYou have used " + trees + " trees!";
				String s3 = "Your paper intake decreased by " + ((double)diff/cnt*100) + "%";
				JDialog d = new JDialog(frame);
				d.setSize(500, 300);
				JPanel j = new JPanel();
				j.add(new Label(s1));
				j.add(new Label(s2));
				j.add(new Label(s3));
				d.add(j);
			    d.setLocationRelativeTo(frame);
			    d.setVisible(true);
			}
		});
		
		
		
		
		
		
		
		 try {
			    FileWriter writers = new FileWriter("C:\\\\Users\\\\ssd500\\\\Desktop\\\\MyFiles.txt", false);
	            FileWriter writer = new FileWriter("C:\\\\Users\\\\ssd500\\\\Desktop\\\\MyFile.txt", false);
//	            for(int i = 0; i < 10; i++) {
//	            writer.write("{\n \"ID\": " + students[i].ID + ",\n \"thisMonth\": "+ students[i].thisMonth + ",\n \"prevMonth\": "+ students[i].prevMonth + ",\n \"thisYear\": "+ students[i].thisYear +"\n},");
//	            writer.write("\r\n");   // write new line
//	            writers.write(students[i].ID + "," + students[i].thisMonth + "," + students[i].prevMonth + "," + students[i].thisYear + "\n");
//	            }
	            writer.close();
	            writers.close();
	        } catch (IOException e) {
	        	System.out.println("SSD");
	            e.printStackTrace();
	        }
	
	}



}