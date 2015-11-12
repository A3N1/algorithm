//2���T��

import java.util.Scanner;

class BinSearch{

//�z��a�̐擪n�̗v�f����key�ƈ�v����v�f��2���T��
static int binSearch(int[] a, int n, int key){
	int pl = 0;	//�T���͈͐擪�̃C���f�b�N�X
	int pr = n-1;	//�T���͈͖����̃C���f�b�N�X

	do{
		int pc = (pl + pr) / 2;	//�����v�f�̃C���f�b�N�X
		if (a[pc] == key)
			return pc;	//�T������
		else if (a[pc] < key)
			pl = pc + 1;	//�T���͈͂��㔼�ɍi�荞��
		else
			pr = pc - 1;	//�T���͈͂�O���ɍi�荞��
	}while (pl <= pr);

	return -1;	//�T�����s
}

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
	int ky = stdIn.nextIt();

	int idx = binSearch(x, num, ky);	//�z��x����l��ky�̗v�f��T��

	if (idx == -1)
		System.out.println("���̒l�̗v�f�͑��݂��܂���B");
	else
		System.out.println("���̒l��x[" + idx + "]�ɂ���܂��B");
	}
}

