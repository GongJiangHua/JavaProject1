package cn.qianfeng.proj;

import java.io.*;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;


public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //User u = new User();
        //u.setUsername("龚江华");
        //System.out.println(u.getUsername());
        File file1;
        file1 = new File("C:\\Users\\GJH20000127\\Desktop\\存储文件\\1013存储");
        final boolean flag1 = file1.createNewFile();
        System.out.println("flag1:"+flag1);
        /*File file2 = new File("C:\\Users\\GJH20000127\\Desktop\\存储文件\\a");
        final boolean flag2 = file2.mkdir();
        System.out.println("flag2"+flag2);
        File file3 = new File("C:\\Users\\GJH20000127\\Desktop\\c\\a\\b");
        boolean flag3 = file3.mkdirs();
        System.out.println("flag3"+flag3);*/
        //将类型数据存入text文件
        //存入磁盘
        //文件输出流
        /*FileOutputStream fis = new FileOutputStream("C:\\Users\\GJH20000127\\Desktop\\存储文件\\1010存储.txt");
        //对象输出流
        ObjectOutputStream outputStr =new ObjectOutputStream(fis);
        //开始输出
        outputStr.writeObject(u);
        //关闭流
        outputStr.close();
        fis.close();*/
        //要读取的文件路径
        String path = "C:\\Users\\GJH20000127\\Desktop\\存储文件\\1010存储.txt";
        //文件输入流
        FileInputStream fis = new FileInputStream(path);
        //对象输入流
        ObjectInputStream ois = new ObjectInputStream(fis);
        //读取数据，数据类型转换
        User Obj =(User)ois.readObject();
        System.out.println(Obj);
        //关闭流
        fis.close();
        ois.close();
    }
}
