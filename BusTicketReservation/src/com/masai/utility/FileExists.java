package com.masai.utility;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import com.masai.entities.Bookings;
import com.masai.entities.Bus;
import com.masai.entities.User;
import java.io.File;



public class FileExists {

	public static List<Bus> busesFile() {

		List<Bus> pFile = null;

		File f = new File("Buses.ser");
		boolean flag = false;
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}

			if (flag) {

				pFile = new ArrayList<>();
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(pFile);
				return pFile;

			} else {

				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				pFile = (List<Bus>) ois.readObject();

				return pFile;

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return pFile;
	}

	public static List<User> usersFile() {

		List<User> cFile = null;

		File f = new File("Users.ser");
		boolean flag = false;
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}

			if (flag) {
				
				cFile = new ArrayList<>();
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(cFile);
				return cFile;

			} else {
				
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				cFile = (List<User>) ois.readObject();

				return cFile;

			}

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}
		return cFile;

	}

	public static List<Bookings> bookingListFile() {

		List<Bookings> tFile = new ArrayList<>();

		File f = new File("Booking.ser");
		boolean flag = false;
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}

			if (flag) {
				tFile =  new ArrayList<>();
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(tFile);

				return tFile;

			} else {

				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				tFile = (List<Bookings>) ois.readObject();
				return tFile;

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		return tFile;

	}

}
