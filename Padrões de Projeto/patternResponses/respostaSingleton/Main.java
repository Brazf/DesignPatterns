package respostaSingleton;

public class Main {

	public static void main(String[] args) {

        // Utilização do arquivo de configuração
        ConfigureSingleton configuracao = ConfigureSingleton.getInstance();

        System.out.println("AppId: " + configuracao.getAppId());
        System.out.println("UserName: " + configuracao.getUserName());
        System.out.println("Language: " + configuracao.getLanguage());
        System.out.println("Offline: " + configuracao.getOffline());
        System.out.println("AutoDLC: " + configuracao.getAutoDLC());
        System.out.println("BuildId: " + configuracao.getBuildId());
        System.out.println("DLCName: " + configuracao.getDLCName());
        System.out.println("UpdateDB: " + configuracao.getUpdateDB());
        System.out.println("Signature: " + configuracao.getSignature());
        System.out.println("WindowInfo: " + configuracao.getWindowInfo());
        System.out.println("LVWindowInfo: " + configuracao.getLVWindowInfo());
        System.out.println("ApplicationPath: " + configuracao.getApplicationPath());
        System.out.println("WorkingDirectory: " + configuracao.getWorkingDirectory());
        System.out.println("WaitForExit: " + configuracao.getWaitForExit());
        System.out.println("NoOperation: " + configuracao.getNoOperation());
        
    }
	
}
