package FactoryMethod;

/**
 * 多个工厂方法模式
 * 
 * @author haondroid
 * 
 */
public class SendFactory2
{
	public Sender pruduceMain()
	{
		return new MailSender();

	}

	public Sender pruduceEms()
	{
		return new EmsSender();

	}

	public static void main(String args[])
	{
		SendFactory2 senderFactory2 = new SendFactory2();
		Sender sender = senderFactory2.pruduceEms();
		sender.sender();

	}

}
