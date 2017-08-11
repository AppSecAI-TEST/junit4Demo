package com.imooc.uitl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ErrorAndFailureTest {
	/*
	 * Failure��һ���ɵ�Ԫ����ʹ�õĶ��Է����ж�ʧ�ܶ�����ģ���ʾ���Ե㷢�������⡣����˵���ԵĽ�������������Ľ����һ�¡�
	 * Errors��error���ɴ����쳣����ģ������ܲ����ڲ��Դ��뱾��Ĵ���Ҳ�����Ǳ����Դ����е�һ�����ص�bug
	 * 
	 * ����������������֤�����ǶԵģ���������֤����û�д�
	 */
	
	@Test
	public void testAdd(){
		assertEquals(5, new Calculate().add(3, 3));
	}
	
	@Test
	public void testDivide(){
		assertEquals(3, new Calculate().divide(6, 0));
	}

}
