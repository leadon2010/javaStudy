package project.score;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

class ScoreFrame extends JFrame implements ActionListener, MouseListener {

	ScoreDAO scoreDAO;
	ScoreDTO scoreDTO;

	JLabel jlName, jlKor, jlEng, jlMat;
	JTextField jtName, jtKor, jtEng, jtMat;
	JButton jbAdd, jbDel, jbChange, jbSearch;
	JTable table;
	Vector data, col;

	ScoreFrame() {
		setLayout(null);
		scoreDAO = new ScoreDAO();

		add(jlName = new JLabel("이름", JLabel.CENTER));
		jlName.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jlName.setBorder(BorderFactory.createBevelBorder(0));
		jlName.setBounds(10, 10, 120, 50);
		add(jtName = new JTextField());
		jtName.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jtName.setHorizontalAlignment(JTextField.CENTER);
		jtName.setBounds(140, 10, 120, 50);

		add(jlKor = new JLabel("국어 점수", JLabel.CENTER));
		jlKor.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jlKor.setBorder(BorderFactory.createBevelBorder(0));
		jlKor.setBounds(10, 70, 120, 50);
		add(jtKor = new JTextField());
		jtKor.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jtKor.setHorizontalAlignment(JTextField.CENTER);
		jtKor.setBounds(140, 70, 120, 50);

		add(jlEng = new JLabel("영어 점수", JLabel.CENTER));
		jlEng.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jlEng.setBorder(BorderFactory.createBevelBorder(0));
		jlEng.setBounds(10, 130, 120, 50);
		add(jtEng = new JTextField());
		jtEng.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jtEng.setHorizontalAlignment(JTextField.CENTER);
		jtEng.setBounds(140, 130, 120, 50);

		add(jlMat = new JLabel("수학 점수", JLabel.CENTER));
		jlMat.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jlMat.setBorder(BorderFactory.createBevelBorder(0));
		jlMat.setBounds(10, 190, 120, 50);
		add(jtMat = new JTextField());
		jtMat.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jtMat.setHorizontalAlignment(JTextField.CENTER);
		jtMat.setBounds(140, 190, 120, 50);

		add(jbAdd = new JButton("추가"));
		jbAdd.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jbAdd.setBounds(270, 10, 120, 50);
		jbAdd.addActionListener(this);

		add(jbDel = new JButton("삭제"));
		jbDel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jbDel.setBounds(270, 70, 120, 50);
		jbDel.addActionListener(this);

		add(jbChange = new JButton("수정"));
		jbChange.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jbChange.setBounds(270, 130, 120, 50);
		jbChange.addActionListener(this);

		add(jbSearch = new JButton("조회"));
		jbSearch.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jbSearch.setBounds(270, 190, 120, 50);
		jbSearch.addActionListener(this);

		col = new Vector();

		col.add("이름");
		col.add("국어 점수");
		col.add("영어 점수");
		col.add("수학 점수");
		col.add("총점");
		col.add("평균");

		DefaultTableModel model = new DefaultTableModel(scoreDAO.getScore(), col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		table = new JTable(model);
		table.addMouseListener(this);
		JScrollPane scroll = new JScrollPane(table);

		jTableSet();
		add(scroll);
		scroll.setBounds(415, 10, 770, 250);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - 1200) / 2, (screenSize.height - 300) / 2);

		setResizable(false);
		setSize(1200, 300);
		setTitle("성적 관리프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int rowIndex = table.getSelectedRow();
		jtName.setText(table.getValueAt(rowIndex, 0) + "");
		jtKor.setText(table.getValueAt(rowIndex, 1) + "");
		jtEng.setText(table.getValueAt(rowIndex, 2) + "");
		jtMat.setText(table.getValueAt(rowIndex, 3) + "");
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonFlag = e.getActionCommand();

		if (buttonFlag.equals("추가")) {
			try {
				contentSet();
				int result = scoreDAO.insertScore(scoreDTO);
				if (result == 1) {
					JOptionPane.showMessageDialog(this, "추가 되었습니다");
					jTableRefresh();
					contentClear();
				} else
					JOptionPane.showMessageDialog(this, "다시 처리하세요.");
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
			}

		} else if (buttonFlag.equals("삭제")) {
			try {
				contentSet();
				int result = scoreDAO.deleteScore(scoreDTO);
				if (result == 1) {
					JOptionPane.showMessageDialog(this, "삭제 되었습니다");
					jTableRefresh();
					contentClear();
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
			}

		} else if (buttonFlag.equals("수정")) {
			try {
				contentSet();
				int result = scoreDAO.updateScore(scoreDTO);
				if (result == 1) {
					JOptionPane.showMessageDialog(this, "수정 되었습니다");
					jTableRefresh();
					contentClear();
				}
			} catch (Exception e3) {
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
			}
		} else if (buttonFlag.equals("조회")) {

		}
	}

	public void jTableRefresh() {
		DefaultTableModel model = new DefaultTableModel(scoreDAO.getScore(), col) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(model);
		jTableSet();
	}

	public void jTableSet() {
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		DefaultTableCellRenderer celAlignRight = new DefaultTableCellRenderer();
		celAlignRight.setHorizontalAlignment(JLabel.RIGHT);
		DefaultTableCellRenderer celAlignLeft = new DefaultTableCellRenderer();
		celAlignLeft.setHorizontalAlignment(JLabel.LEFT);

		table.getColumnModel().getColumn(0).setPreferredWidth(10);
		table.getColumnModel().getColumn(0).setCellRenderer(celAlignCenter);
		table.getColumnModel().getColumn(1).setPreferredWidth(10);
		table.getColumnModel().getColumn(1).setCellRenderer(celAlignRight);
		table.getColumnModel().getColumn(2).setPreferredWidth(10);
		table.getColumnModel().getColumn(2).setCellRenderer(celAlignCenter);
		table.getColumnModel().getColumn(3).setPreferredWidth(10);
		table.getColumnModel().getColumn(3).setCellRenderer(celAlignCenter);
		table.getColumnModel().getColumn(4).setPreferredWidth(20);
		table.getColumnModel().getColumn(4).setCellRenderer(celAlignCenter);
		table.getColumnModel().getColumn(5).setPreferredWidth(20);
		table.getColumnModel().getColumn(5).setCellRenderer(celAlignCenter);

	}

	public void contentSet() {
		scoreDTO = new ScoreDTO();

		String name = jtName.getText();

		if (name == null || name.equals(""))
			JOptionPane.showMessageDialog(this, "이름을 입력하세요");
		else {
			int kor, eng, mat, tot, ave;
			if (jtKor.getText().equals("") || jtKor.getText().equals(null)) {
				kor = 0;
			} else {
				kor = Integer.parseInt(jtKor.getText());
			}
			if (jtEng.getText().equals("") || jtEng.getText().equals(null)) {
				eng = 0;
			} else {
				eng = Integer.parseInt(jtEng.getText());
			}
			if (jtMat.getText().equals("") || jtMat.getText().equals(null)) {
				mat = 0;
			} else {
				mat = Integer.parseInt(jtMat.getText());
			}
			tot = kor + eng + mat;
			ave = tot / 3;
			scoreDTO.setName(name);
			scoreDTO.setKor(kor);
			scoreDTO.setEng(eng);
			scoreDTO.setMat(mat);
			scoreDTO.setTot(tot);
			scoreDTO.setAve(ave);
		}
	}

	public void contentClear() {
		jtName.setText("");
		jtKor.setText("");
		jtEng.setText("");
		jtMat.setText("");
	}

}

public class Score {
	public static void main(String[] args) {
		new ScoreFrame();
	}
}
