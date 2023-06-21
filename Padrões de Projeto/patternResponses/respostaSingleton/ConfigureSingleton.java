package respostaSingleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConfigureSingleton {

	private static ConfigureSingleton instancia;
    private String appId;
    private String userName;
    private String language;
    private int offline;
    private int autoDLC;
    private String buildId;
    private String dlcName;
    private int updateDB;
    private String signature;
    private String windowInfo;
    private String lvWindowInfo;
    private String applicationPath;
    private String workingDirectory;
    private int waitForExit;
    private int noOperation;

    private ConfigureSingleton() {
    	
        // Leitura do arquivo de configuração
    	
        try {
        	BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;
            
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split("=");
                String chave = partes[0].trim();
                String valor = partes[1].trim();

                // Preenche os campos da classe de acordo com as chaves do arquivo
                
                switch (chave) {
                    case "AppId":
                        appId = valor;
                        break;
                    case "UserName":
                        userName = valor;
                        break;
                    case "Language":
                        language = valor;
                        break;
                    case "Offline":
                        offline = Integer.parseInt(valor);
                        break;
                    case "AutoDLC":
                        autoDLC = Integer.parseInt(valor);
                        break;
                    case "BuildId":
                        buildId = valor;
                        break;
                    case "DLCName":
                        dlcName = valor;
                        break;
                    case "UpdateDB":
                        updateDB = Integer.parseInt(valor);
                        break;
                    case "Signature":
                        signature = valor;
                        break;
                    case "WindowInfo":
                        windowInfo = valor;
                        break;
                    case "LVWindowInfo":
                        lvWindowInfo = valor;
                        break;
                    case "ApplicationPath":
                        applicationPath = valor;
                        break;
                    case "WorkingDirectory":
                        workingDirectory = valor;
                        break;
                    case "WaitForExit":
                        waitForExit = Integer.parseInt(valor);
                        break;
                    case "NoOperation":
                        noOperation = Integer.parseInt(valor);
                        break;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigureSingleton getInstance() {
        if (instancia == null) {
            instancia = new ConfigureSingleton();
        }
        return instancia;
    }

    // Métodos para acessar individualmente os campos do arquivo de configuração
    
    public String getAppId() {
        return appId;
    }

    public String getUserName() {
        return userName;
    }

    public String getLanguage() {
        return language;
    }

    public int getOffline() {
        return offline;
    }

    public int getAutoDLC() {
        return autoDLC;
    }

    public String getBuildId() {
        return buildId;
    }

    public String getDLCName() {
        return dlcName;
    }

    public int getUpdateDB() {
        return updateDB;
    }

    public String getSignature() {
        return signature;
    }

    public String getWindowInfo() {
        return windowInfo;
    }

    public String getLVWindowInfo() {
        return lvWindowInfo;
    }

    public String getApplicationPath() {
        return applicationPath;
    }

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    public int getWaitForExit() {
        return waitForExit;
    }

    public int getNoOperation() {
        return noOperation;
    }
    
}
