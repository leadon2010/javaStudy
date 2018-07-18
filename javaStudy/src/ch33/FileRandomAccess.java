package ch33;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileRandomAccess {
	public static void main(String[] args) {
		Path fp = Paths.get("data.dat");

		ByteBuffer wb = ByteBuffer.allocate(1024);

		wb.putInt(120);
		wb.putInt(240);
		wb.putDouble(0.94);
		wb.putDouble(0.75);

		try (FileChannel fc = FileChannel.open(fp, StandardOpenOption.CREATE, StandardOpenOption.READ,
				StandardOpenOption.WRITE)) {
			wb.flip();
			fc.write(wb);

			ByteBuffer rb = ByteBuffer.allocate(1024);
			fc.position(0);
			fc.read(rb);

			rb.flip();
			System.out.println(rb.getInt());
			rb.position(Integer.BYTES);

			System.out.println(rb.getDouble());
			System.out.println(rb.getDouble());

			rb.position(Integer.BYTES);
			System.out.println(rb.getInt());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
