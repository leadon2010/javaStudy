package project.notepad;

import java.awt.Container;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

// https://startcoding.tistory.com/75

public class Note extends JFrame {

	JTextArea text;
	Container pane;
	JMenuBar nb = new JMenuBar();
	JMenu file, help;
	JMenuItem newI, openI, saveI, closeI, infoI, helpI;
	JFileChooser open = new JFileChooser();

}
