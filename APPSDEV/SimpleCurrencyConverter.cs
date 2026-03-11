using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace SimpleCurrencyConverter
{
    public partial class Form1 : Form
    {
        private List<string> currencies = new List<string>()
        {
            "PHP", "EUR", "CAD", "USD"
        };

        public Form1()
        {
            InitializeComponent();
            InitializeComboBoxes();
        }

        private void InitializeComboBoxes()
        {
       
            currencyFr.Items.AddRange(currencies.ToArray());
            currencyTo.Items.AddRange(currencies.ToArray());

            currencyFr.SelectedIndexChanged += currencyFr_SelectedIndexChanged;
            currencyTo.SelectedIndexChanged += currencyTo_SelectedIndexChanged;

            currencyFr.SelectedItem = "PHP";
            UpdateCurrencyTo();
        }

        private void currencyFr_SelectedIndexChanged(object sender, EventArgs e)
        {
            UpdateCurrencyTo();
        }

        private void currencyTo_SelectedIndexChanged(object sender, EventArgs e)
        {
            UpdateCurrencyFrom();
        }

        private void UpdateCurrencyTo()
        {
            currencyTo.SelectedIndexChanged -= currencyTo_SelectedIndexChanged;

            string selectedFrom = currencyFr.SelectedItem?.ToString();

            currencyTo.Items.Clear();

            foreach (string currency in currencies)
            {
                if (currency != selectedFrom)
                    currencyTo.Items.Add(currency);
            }

            if (currencyTo.Items.Count > 0)
                currencyTo.SelectedIndex = 0;

            currencyTo.SelectedIndexChanged += currencyTo_SelectedIndexChanged;
        }

        private void UpdateCurrencyFrom()
        {
            currencyFr.SelectedIndexChanged -= currencyFr_SelectedIndexChanged;

            string selectedTo = currencyTo.SelectedItem?.ToString();

            currencyFr.Items.Clear();

            foreach (string currency in currencies)
            {
                if (currency != selectedTo)
                    currencyFr.Items.Add(currency);
            }

            if (currencyFr.Items.Count > 0)
                currencyFr.SelectedIndex = 0;

            currencyFr.SelectedIndexChanged += currencyFr_SelectedIndexChanged;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrWhiteSpace(amount.Text))
            {
                warninglbl.Text = "Please enter an amount.";
                amount2.Text = "";
                currencyFr2.Text = "";
                currencyTo2.Text = "";
                convertedAmt.Text = "";
                return;
            }
            else
            {
                warninglbl.Text = "";
            }

            if (!double.TryParse(amount.Text, out double inputAmount))
            {
                warninglbl.Text = "Enter a valid number.";
                return;
            }
            else
            {
                warninglbl.Text = "";
            }

            string from = currencyFr.SelectedItem.ToString();
            string to = currencyTo.SelectedItem.ToString();

            double rate = GetRate(from, to);
            double converted = inputAmount * rate;

            string fromSymbol = GetSymbol(from);
            string toSymbol = GetSymbol(to);

            amount2.Text = fromSymbol + inputAmount.ToString("N2");
            currencyFr2.Text = from;
            currencyTo2.Text = to;
            convertedAmt.Text = toSymbol + converted.ToString("N2");
        }

        private double GetRate(string from, string to)
        {
            Dictionary<string, double> rates = new Dictionary<string, double>()
    {
        { "PHP", 1 },
        { "USD", 55 },
        { "EUR", 60 },
        { "CAD", 42 }
    };

            return rates[from] / rates[to];
        }

        private string GetSymbol(string currency)
        {
            switch (currency)
            {
                case "PHP": return "₱";
                case "USD": return "$";
                case "EUR": return "€";
                case "CAD": return "C$";
                default: return "";
            }
        }
    }
}
