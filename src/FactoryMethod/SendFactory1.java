package FactoryMethod;

/**
 * 普通工厂模式
 * 
 * @author haondroid
 * 
 */
public class SendFactory1
{

	public Sender produce(String type)
	{

		if ("mail".equals(type))
		{
			return new MailSender();
		} else if ("sms".equals(type))
		{
			return new EmsSender();
		} else
		{
			System.out.println("请输入正确的类型!");
			return null;
		}

	}

	public static void main(String args[])
	{
		SendFactory1 sendFactory = new SendFactory1(); // 创建工厂
		Sender sender = sendFactory.produce("mail"); // 调用工程的生产方法。产生对应的不同的产品
		sender.sender();
	}

}
