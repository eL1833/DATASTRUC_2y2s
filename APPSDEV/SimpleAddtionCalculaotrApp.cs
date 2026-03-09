using System;
using System.Windows.Forms;

namespace SimpleAdditionCalculatorApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            cmboperator.Items.Add("+");
            cmboperator.SelectedIndex = 0;

            errorLbl.Text = "";
        }

        private void calculateBtn_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrWhiteSpace(operand1Txt.Text) ||
                string.IsNullOrWhiteSpace(operand2Txt.Text))
            {
                errorLbl.Text = "Please fill in both input fields.";
                operand1Txt.Text = "";
                operand2Txt.Text = "";
                resultLbl.Text = "";
                return;
            }

            errorLbl.Text = "";

            double operand1 = Convert.ToDouble(operand1Txt.Text);
            double operand2 = Convert.ToDouble(operand2Txt.Text);

            double result = operand1 + operand2;

            resultLbl.Text = result.ToString();
        }
    }
}
