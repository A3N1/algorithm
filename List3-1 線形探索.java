//���`�T��

import java.util.Scanner;

class SeqSearch{

//�z��a�̐擪n�̗v�f����key�ƈ�v����v�f����`�T��
static int seqSearch(int[] a, int n, int key){
	int i=0;

	while (true){	//�������[�v
		if (i == n)	//i��n�ł���
			return -1;	//�T�����s(-1��ԋp)
		if (a[i] == key)	//�z��̗v�f��key�ƈ�v
			return i;	//�T������(�C���f�b�N�X��ԋp)
		i++;	//i��1���₷
	}
}

public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);

	System.out.print("�v�f���F");
	int num = stdIn.nextInt();
	int[] x = new int[num];	//�v�f��num�̔z��

	for (int i=0; i<num; i++){
		System.out.print("x[" + i + "] �F");
		x[i] = stdIn.nextInt();
	}

	System.out.print("�T���l�F");	//�L�[�l�̓Ǎ���
	int ky = stdIn.nextInt();

	int idx = seqSearch(x, num, ky);	//�z��x����l��ky�̗v�f��T��

	if (idx == -1)
		System.out.println("���̒l�̗v�f�͑��݂��܂���B");
	else
		System.out.println("���̒l��x[" + idx + "]�ɂ���܂��B");
	}
}

