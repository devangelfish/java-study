package kr.ac.syu.day03.abs;

/*
 *  Override �������� ���ҵ���,
 *  Animal�� eat() �޼ҵ��� ��¹��� ���ʿ��ϴ�. -> ������ ������� ���� ��!
 *  ������ �뵵�� �θ� Ŭ������ �ξ��⿡ �θ��� ���� ����� �ʿ����� �ʰ�,
 *  ���� �����ϵ��� eat() �޼ҵ��� ������ ���! -> ����!
 *  ����, Animal ��ü ���� �������� �ʴ´�.
 *  
 *  abstract class (�߻� Ŭ����)
 *  	- ��ü�� ������ �ʴ� Ŭ����, �������� ���� Ŭ����
 *  	- �ϳ� �̻��� �޼ҵ尡 abstract �ϴٸ�,
 *  	    Ŭ������ abstract �ؾ��Ѵ�.
 */

public abstract class Animal {
	public abstract void eat();	// �߻� �޼ҵ�
	// ���� ������ ���� �����ϰ� ����(����)�� ����!
	//	-> ���� ���౸��(Block, Body, { })�� ������ �ʴ´�.
	
	public void cry() { } // Ȱ�� ����!
}





