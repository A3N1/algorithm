//���`�T��(�ԕ��@)

import java.util.Scanner;

class SeqSearchSen{

//�z��a�̐擪n�̗v�f����key�ƈ�v����v�f����`�T��(�ԕ��@)
static int seqSearchSen(int[] a, int n, int key){
	int i = 0;

	a[n] = key;	//�T������lkey��ԕ��Ƃ���a[n]�ɑ��

	while (true){
		if (a[i] == key)	//�T������
			break;
		i++;	//i��1���₷
	}
	return i == n ? -1 : i;	//�{���̃f�[�^���������̂��ԕ����������̂��̔���
}

public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);

	System.out.print("�v�f���F");
	int num = stdIn.nextInt();
	int[] x = new int[num + 1];	//�v�f��num+1�̔z��

	for (int i=0; i<num; i++){
		System.out.print("x[" + i + "]�F");
		x[i] = stdIn.nextInt();
	}

	System.out.print("�T���l�F");	//�L�[�l�̓Ǎ���
	int ky = stdIn.nextInt();

	int idx = seqSearchSen(x, num, ky);	//�z��x����l��ky�̗v�f��T��

	if (idx == -1)
		System.out.println("���̒l�̗v�f�͑��݂��܂���B");
	else
		System.out.println("���̒l��x[" + idx + "]�ɂ���܂��B");
	}
}

