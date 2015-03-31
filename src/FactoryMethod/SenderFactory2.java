package FactoryMethod;

/**
 * 多个工厂方法模式
 * 
 * @author haondroid
 * 
 */
public class SenderFactory2
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
		SenderFactory2 senderFactory2 = new SenderFactory2();
		Sender sender = senderFactory2.pruduceEms();
		sender.sender();

	}

}
