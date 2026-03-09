using System;
using System.Windows.Forms;

namespace SimpleAdditionCalculatorApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            // Add "+" to the operator dropdown
            operatorCmb.Items.Add("+");
            operatorCmb.SelectedIndex = 0;

            // Hide error label initially
            errorLbl.Text = "";
        }

        private void calculateBtn_Click(object sender, EventArgs e)
        {
            // Check if any input field is empty
            if (string.IsNullOrWhiteSpace(operand1Txt.Text) || 
                string.IsNullOrWhiteSpace(operand2Txt.Text))
            {
                errorLbl.Text = "Please fill in both input fields.";
                return;
            }

            // Clear error message
            errorLbl.Text = "";

            // Convert inputs to numbers
            double operand1 = Convert.ToDouble(operand1Txt.Text);
            double operand2 = Convert.ToDouble(operand2Txt.Text);

            // Perform addition
            double result = operand1 + operand2;

            // Display result
            resultLbl.Text = result.ToString();
        }
    }
}
