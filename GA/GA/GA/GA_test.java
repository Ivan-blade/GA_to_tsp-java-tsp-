package GA;
//https://blog.csdn.net/xl_1803/article/details/82429857���ӻ��ο�
import GA.Chromosome;
import GA.DynamicDataWindow;

import GA.GA_test;
//ctrl+F11ֱ�����м��ɣ�
public class GA_test extends GA{  
    /***/
	public static final int GENE_LENGTH = excelData.keyInit().length;
	/**�����Ӧ����ֵ���ޣ��ɻ��� ��λ������*/
    
    public GA_test() {  
        super(GENE_LENGTH);    
    }  
      
    @Override  
    public double changeX(Chromosome chro) {    
        return chro.getNum();  
    }  
  
    @Override  
    public double caculateY(double x) {  
    	double y=20000/x;
    	return y;  
    	
    }  
  
    public static void main(String[] args) {  
        GA_test test = new GA_test(); 
        test.setDdWindow(new DynamicDataWindow("�Ŵ��㷨���Ż�������"));
        test.caculate();  
    }  
}  
