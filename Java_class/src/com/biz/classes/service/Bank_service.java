package com.biz.classes.service;

import com.biz.classes.model.Bank_VO;

public class Bank_service 
{
    public void lookup(Bank_VO[] bank_VO)
    {
        for(int i=0; i<bank_VO.length; ++i)
             bank_VO[i].setValace();
    }

    public void bankinfo(Bank_VO[] bank_VO)
    {
        lookup(bank_VO);
        Line_service line_service = new Line_service();
        String lines = line_service.single(50);

        System.out.println(lines);
        System.out.println("계좌번호   날짜\t\t 입금\t 출금\t 잔액");
        System.out.println(lines);
        for(int i=0; i<bank_VO.length; ++i)
        {
            System.out.printf("%s\t %s\t %d\t %d\t %d\n", bank_VO[i].getNum(),   bank_VO[i].getDate(),
                                                          bank_VO[i].getInput(), bank_VO[i].getOuput(),
                                                          bank_VO[i].getValace());
            System.out.println(lines);
            
        }
    }    
}