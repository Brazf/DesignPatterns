package designMemento;

public class Main {

	public static void main(String[] args) {
		
		// NOSSO EXEMPLO SERÁ COM UM EDITOR DE TEXTO
        Originator editor = new Originator();
        Caretaker zelador = new Caretaker();

        // Altera o conteúdo do editor
        editor.setContent("Hoje é quinta-feira");
        System.out.println("__________________________________________________\n\nUsuário digita o primeiro conteúdo:");
        System.out.println(editor.getContent());
        System.out.println("__________________________________________________");
        // Salva o estado atual do editor no zelador
        zelador.backup(editor.createMemento());
       
        
        
        // Altera o conteúdo do editor novamente
        editor.setContent("Hoje é quinta-feira 13:53");
        System.out.println("__________________________________________________\n\nUsuário digita o segundo conteúdo:");
        System.out.println(editor.getContent());
        System.out.println("__________________________________________________");
        // Salva o estado atual do editor no histórico
        zelador.backup(editor.createMemento());

        
        
        // Altera o conteúdo do editor mais uma vez
        editor.setContent("Hoje é quinta-feira 13:53 da manhã");
        System.out.println("__________________________________________________\n\nUsuário digita o terceiro conteúdo:");
        System.out.println(editor.getContent());
        System.out.println("__________________________________________________");
        
        // Restaura o editor para o estado anterior
        Memento previousMemento = zelador.restore();
        editor.restoreFromMemento(previousMemento);

        System.out.println("__________________________________________________\n\nUsuário refaz o conteúdo da frase:");
        System.out.println(editor.getContent());
        System.out.println("__________________________________________________");
    }
	
}
