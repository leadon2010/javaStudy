package nio;

import java.nio.ByteBuffer;

public class BufferSizeExample {
	public static void main(String[] args) {
		ByteBuffer directBuffer = ByteBuffer.allocateDirect(1000 * 1024 * 1024);
		System.out.println("directBuffer created.");

		ByteBuffer nonDirectBuffer = ByteBuffer.allocate(1000 * 1024 * 1024);
		System.out.println("nonDireceBuffer created.");
	}
}
