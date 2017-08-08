using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GitProject
{
    public partial class FrmIvan : Form
    {
        public int[] numbers;
        public FrmIvan()
        {
            InitializeComponent();
           
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int n=0;
            try
            {
                n = Convert.ToInt32(textBox1.Text);
                randomNumber(n);
            }
            catch (Exception ex)
            {
                MessageBox.Show("Only integers are allowed", "Error", MessageBoxButtons.OK,MessageBoxIcon.Information);
            }

        }

        public void randomNumber(int n)
        {
            int Max = 0;
            Random random = new Random();
            numbers = new int[n];
            for(int i = 0; i < numbers.Length;i++)
            {
                numbers[i] = random.Next(1, 100);
            }
            Max = numbers.Max();

            MessageBox.Show("The largest number from the " + n + " numbers is " + Max);
        }
    }
}
