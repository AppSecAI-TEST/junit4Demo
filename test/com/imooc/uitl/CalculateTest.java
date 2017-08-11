package com.imooc.uitl;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * �����㷨��
 * @author Administrator
 *
 */
public class CalculateTest {
	/*
	 * 1.���Է����ϱ���ʹ��@Testע������
	 * 2.���Է�������ʹ��public void���Σ����ܴ��κβ���
	 * 3.�½�һ��Դ����Ŀ¼��������ǵĲ��Դ��루����testĿ¼��
	 * 4.�������Ӧ�úͱ������������һ��
	 * 5.���Ե�Ԫ�е�ÿ������������Զ������ԣ����Է����䲻�����κε�����
	 * 6.������ʹ��Test��Ϊ���������ĺ�׺������淶��
	 * 7.���Է���ʹ��test��Ϊ���Է�����ǰ׺������淶��
	 */

	@Test
	public void testAdd(){
		assertEquals(6, new Calculate().add(3, 3));
	}
	
	@Test
	public void testSubtact(){
		assertEquals(2, new Calculate().subtact(5, 3));
	}
	
	@Test
	public void testMultiply(){
		assertEquals(4, new Calculate().multiply(2, 2));
	}
	
	@Test
	public void testDivide(){
		assertEquals(3, new Calculate().divide(6, 2));
	}

}
