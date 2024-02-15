package ch18.fileio.bytestream01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy {
	public static void main(String[] args) throws IOException {
		/* ---------------1) 스트림 생성-------------------------- */
//		InputStream in = new FileInputStream("cat.png");
		InputStream in = new FileInputStream("putty.exe");
//		OutputStream out = new FileOutputStream("고양이.png");
		OutputStream out = new FileOutputStream("푸푸티티.exe");
		/* ----------------2) 스트림을 통해 입출력 ------------------------- */
		int copyByte = 0;
		int readLen;
		byte[] buf = new byte[1024];		// 한 번에 읽어들인다
		long stime = System.currentTimeMillis();
		while(true) {
			// 읽을 때 buf배열 크기만큼 읽으려고 시도
			// 실제 읽어들인 byte크기는 readLen
			readLen = in.read(buf);
			if (readLen == -1) break;		// 더이상 읽을 것이 없으면 -1
			out.write(buf, 0, readLen);		// buf에서 읽어들인 크기만큼 저장
			copyByte += readLen;			// 읽어들인 크기를 누적
		}
		long etime = System.currentTimeMillis();
		/* ---------------- 3) 스트림 연결 종료 ------------------------- */
		in.close();
		out.close();
		System.out.println("복사 시간 = " + (etime - stime));
		System.out.println("복사된 바이트 크기 = " + copyByte);
	}
}
