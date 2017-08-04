using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;


namespace ShutdownTimer
{
    public partial class Form1 : Form
    {
        // Global variables
        int iCount, iInput;
        ProcessStartInfo startInfo;

        public Form1()
        {
            InitializeComponent();
            iCount = 0; iInput = 0;
            startInfo = new ProcessStartInfo("shutdown.exe", "-s");// create object to execute shutdown.exe
        }

        private void button1_Click(object sender, EventArgs e)
        {
            timer1.Start();
            iInput = Convert.ToInt16(textBox1.Text);
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            timer1.Stop();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            iCount +=  1;// increment time variable by one to keep record of time elapsed
            if (iCount == iInput)
                Process.Start(startInfo);
            

        }
    }
}
