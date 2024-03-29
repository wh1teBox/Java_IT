package Lessons.Lesson34.Creational.AbstractFactory.src;

public class Run {
	//????? ??? ?????? ?????????? ? ??????????
	public static void PrintPcConfiguration(String configName, PC pc) {
		System.out.println("\n======== " + configName + " ========\n");
		System.out.println("Box: " + pc.GetBox().Info() + "\n");
		System.out.println("Main Board: " + pc.GetMainBoard().Info() + "\n");
		System.out.println("Processor: " + pc.GetProcessor().Info() + "\n");
		System.out.println("HDD: " + pc.GetHdd().Info() + "\n");
		System.out.println("Memory: " + pc.GetMemory().Info() + "\n");
	}
	public static void main(String[] args) {
		
		try {
			// ??????????? ???????????? ??????????
			PCConfigurator configurator = new PCConfigurator();
			PC pc1 = new PC();

			// ????????? ???????????? ?? ???????? ?????????
			configurator.SetPCFactory(new HomePcFactory());
			configurator.Configure(pc1);
			
			PrintPcConfiguration("Home configuration", pc1);
			
			
			PC pc2 = new PC();
			
			// ????????? ???????????? ?? ??????? ?????????
			configurator.SetPCFactory(new OfficePcFactory());
			configurator.Configure(pc2);
			
			PrintPcConfiguration("Office configuration", pc2);

		}
		catch(Exception ex) {
			System.out.println("Exception happened! Exception description\n"+ex.getMessage());
		}

	}

}
