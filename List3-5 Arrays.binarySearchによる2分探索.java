//Arrays.binarySearch�ɂ��2���T��

import java.util.Arrays;
import java.util.Scanner;

class BinarySearchTester{

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�v�f���F");
		int num = stdIn.nextInt();
		int[] x = new int[num];	//�v�f��num�̔z��

		System.out.println("�����ɓ��͂��Ă��������B");

		System.out.print("x[0]�F");	//�擪�v�f�̓Ǎ���
		x[0] = stdIn.nextInt();

		for (int i=1; i<num; i++){
			do{
				System.out.print("x[" + i + "]�F");
				x[i] = stdIn.nextInt();
			}while (x[i] < x[i-1]);	//��O�̗v�f��菬������΍ē���
		}

		System.out.print("�T���l�F");	//�L�[�l�̓Ǎ���
		int ky = stdIn.nextInt();

		int idx = Arrays.binarySearch(x, ky);	//�z��x����l��ky�̗v�f��T��

		if (idx < 0)
			System.out.println("���̒l�̗v�f�͑��݂��܂���B");
		else
			System.out.println("���̒l��x[" + idx + "]�ɂ���܂��B");
	}
}

