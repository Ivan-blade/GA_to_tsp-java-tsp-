package GA;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import jxl.*;
import java.util.Scanner; 

public class excelData{
	
	public static String getType(Object o){ //��ȡ�������ͷ���
		return o.getClass().toString(); //ʹ��int���͵�getClass()����
		} 
	
	public static int cha_int(String temp) {
		Integer one=Integer.parseInt(temp);
		return one;
	}
	
	public static int backIndex(String temp) { //��ȡĿ�����excel�е�����
		int tempIndex = 0;
		//try { 
        	//Workbook book;
		//book= Workbook.getWorkbook(new File("F:/test/summer_task/dis.xls")); 
		//    Sheet sheet = book.getSheet(0);
		//    int n=sheet.getColumns();//��������
		//    int m=sheet.getRows();//��������
		//    int back;
		//    for(int i=0;i<n;i++)
		//    {
            	//    	if(sheet.getCell(i,0).getContents().equals(temp)==true)
		//        {
		//    		tempIndex=i;
		//        }
		//    	
		//    }
		//    book.close(); 
		//}
		//catch(Exception e)  { } 
		for(int i=0;i<excelData.length;i++)
		{
			if(excelData[0][i].equals(temp)==true)
			{
				tempIndex=i;
			}
		}
		
		return tempIndex;
	}

	public static int backDis(int n,int m) {//����Ŀ��ֵ
		int back =cha_int(excelData[n][m]);
		//try { 
		//	Workbook book;
		//    book= Workbook.getWorkbook(new File("F:/test/summer_task/dis.xls")); 
		//    Sheet sheet = book.getSheet(0);
		//    back=cha_int(sheet.getCell(n,m).getContents());
		//    
		//    book.close(); 
		// }
		//catch(Exception e)  { } 
		
		return back;
	}
	
	public static String[][] backExcel(){
		String[][] temp = null;
		try { 
        	Workbook book;
            book= Workbook.getWorkbook(new File("F:/test/summer_task/dis.xls")); 
            Sheet sheet = book.getSheet(0);
            int n=sheet.getColumns();//��������
            int m=sheet.getRows();//��������
            temp=new String[m][n];
            int back;
            for(int i=0;i<n;i++)
            {
            	for(int j=0;j<m;j++)
            	{
            		temp[i][j]=sheet.getCell(j,i).getContents();
            	}
            	
            }
            book.close(); 
        }
        catch(Exception e)  { } 
		return temp;
	}
	
	public static String[][] excelData=backExcel();
	
	public static int[] keyInit(){
		String[] location={"�Ͼ�","�Ϻ�","����","����","����","��ͨ","��","�γ�","̩��","����","����","����"};
        int[] loc=new int[location.length];
        for(int i=0;i<location.length;i++)
        {
        	loc[i]=backIndex(location[i]);
        }
        return loc;
	}

}