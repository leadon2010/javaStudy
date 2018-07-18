package ch33;

import java.nio.ByteBuffer;

public class BufferPostionCheck {
	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.allocate(1024);
		System.out.println(bb.position());

		bb.putInt(120);
		System.out.println(bb.position());

		bb.putDouble(0.94);
		System.out.println(bb.position());

		bb.flip();
		System.out.println(bb.position());

		int n = bb.getInt();
		System.out.println(bb.position());

		double d = bb.getDouble();
		System.out.println(bb.position());

	}
}
