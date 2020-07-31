package gof.design.prototype;

import java.util.Random;

public class MyMain {
	public static void main(String[] args) {
		// 3種類のプロトタイプを作ってプールしておく
		MyParameter max = new MyParameter(100);
		MyParameter min = new MyParameter(1);
		MyParameter def = new MyParameter(10);

		// ランダムに100個の MyParameter オブジェクトを作る
		MyParameter samples[] = new MyParameter[100];
		Random rand = new Random();
		try {
			for(int i = 0; i < 100; i++) {
				int r = rand.nextInt(10);

				// 乱数に応じて3種類あるプロトタイプを選んでコピーする
				if(r > 8) {
					samples[i] = (MyParameter) max.clone();
				} else if(r > 6) {
					samples[i] = (MyParameter) min.clone();
				} else {
					samples[i] = (MyParameter) def.clone();
				}

				System.out.print(samples[i].getValue() + " ");
			}
		} catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
	}
}