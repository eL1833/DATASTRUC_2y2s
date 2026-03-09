using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class SimpleCurrencyConverter : Form
    {
        // Master Currency List
        private List<string> currencies = new List<string>()
        {
            "PHP", "EUR", "CAD", "USD"
        };

        public SimpleCurrencyConverter()
        {
            InitializeComponent();
            InitializeComboBoxes();
        }

        private void InitializeComboBoxes()
        {
            currencyFr.DropDownStyle = ComboBoxStyle.DropDownList;
            currencyTo.DropDownStyle = ComboBoxStyle.DropDownList;

            currencyFr.Items.AddRange(currencies.ToArray());
            currencyTo.Items.AddRange(currencies.ToArray());

            currencyFr.SelectedIndexChanged += currencyFr_SelectedIndexChanged;
            currencyTo.SelectedIndexChanged += currencyTo_SelectedIndexChanged;

            currencyFr.SelectedItem = "PHP";
            UpdateCurrencyTo();
        }

        // When "From" changes
        private void currencyFr_SelectedIndexChanged(object sender, EventArgs e)
        {
            UpdateCurrencyTo();
        }

        // When "To" changes
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

        private void convertBtn_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrWhiteSpace(amount.Text))
            {
                warninglbl.Text = "Please enter an amount.";
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
            } else
            {
                warninglbl.Text = "";
            }

            string from = currencyFr.SelectedItem.ToString();
            string to = currencyTo.SelectedItem.ToString();

            double rate = GetRate(from, to);
            double converted = inputAmount * rate;

            string fromSymbol = GetSymbol(from);
            string toSymbol = GetSymbol(to);

            // OUTPUT DISPLAY (matches your picture)
            amount2.Text = fromSymbol + inputAmount.ToString("N2");
            currencyFr2.Text = from;
            currencyTo2.Text = to;
            convertedAmt.Text = toSymbol + converted.ToString("N2");
        }

        // Exchange Rates relative to PHP
        private double GetRate(string from, string to)
        {
            Dictionary<string, double> rates = new Dictionary<string, double>()
            {
                { "PHP", 1 },
                { "USD", 55 },
                { "EUR", 60 },
                { "CAD", 42 }
            };

            double fromRate = rates[from];
            double toRate = rates[to];

            return toRate / fromRate;
        }

        // Currency Symbols
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
