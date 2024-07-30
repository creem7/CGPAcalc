private class SaveToFileListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
     try (FileWriter writer = new
FileWriter("CgpaCalculatorOutput.txt", true)) {
         writer.write(resultArea.getText() + "\n");
         writer.write(goalArea.getText() + "\n");
        JOptionPane.showMessageDialog(null, "Data saved to
file successfully!");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error saving
data to file.");
      }
    }
}
