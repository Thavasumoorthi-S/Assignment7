package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class CreditcardException
{
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    String holdername;
    Long cardnumber;
    String expiredate;
    CreditcardException(String holdername,Long cardnumber,String expiredate)
    {
        this.holdername=holdername;
        this.cardnumber=cardnumber;
        this.expiredate=expiredate;
    }
    CreditcardException(CreditcardException obj)
    {
        holdername=obj.holdername;
        cardnumber=obj.cardnumber;
        expiredate=obj.expiredate;
    }

    public String equalis(CreditcardException a)
    {
        if(cardnumber.equals(a.cardnumber))
        {
            return "true";
        }
        return "false";
    }
    public static void main(String[] args)
    {
        try {
            String holdername;
            long cardnumber;
            String expiredate;
            String holdername1;
            long cardnumber1;
            String expiredate1;
            String result1;
            String result2;
            Scanner sc = new Scanner(System.in);
            LOGGER.log(Level.INFO, "Enter the Name: ");
            holdername = sc.nextLine();
            LOGGER.log(Level.INFO, "Enter the cardnumber:  ");
            cardnumber = sc.nextLong();
            sc.nextLine();
            LOGGER.log(Level.INFO, "Enter the expiredate:");
            expiredate = sc.nextLine();
            CreditcardException cc = new CreditcardException(holdername, cardnumber, expiredate);
            CreditcardException cc1 = new CreditcardException(cc);
            LOGGER.log(Level.INFO, "current object creditcardnumber and clonnable object creditcard numbers are same? :");
            result1 = cc.equalis(cc1);
            LOGGER.info(result1);
            LOGGER.log(Level.INFO, "Enter the Name: ");
            holdername1 = sc.nextLine();
            LOGGER.log(Level.INFO, "Enter the cardnumber:  ");
            cardnumber1 = sc.nextLong();
            sc.nextLine();
            LOGGER.log(Level.INFO, "Enter the expiredate:");
            expiredate1 = sc.nextLine();
            CreditcardException cc2 = new CreditcardException((holdername1), cardnumber1, expiredate1);
            LOGGER.log(Level.INFO, "current object creditcardnumber and new object creditcard numbers are same? :");
            result2 = cc.equalis(cc2);
            LOGGER.info(result2);
        }
        catch(InputMismatchException e)
        {
            throw new InputMismatchException("please Enter the valid input ");
        }
    }
}
