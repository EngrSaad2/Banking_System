
package bank_management;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
/**
 *
 * @author ABD
 */
public class insert_data {
    Connection conn;
    ResultSet res;
    PreparedStatement pst;
    Statement stt;
    insert_data(){
        try{
            conn = Dbconnect.dbconnection();
            stt = conn.createStatement();
            stt.execute("CREATE DATABASE IF NOT EXISTS bank_management");
            stt.execute("USE bank_management");
            
            //user table and insert
            stt.execute("CREATE TABLE IF NOT EXISTS user("
                    +"id INT not null,"
                    +"pass VARCHAR(20) not null,"
                    +"ac_type VARCHAR(15),"
                    +"join_date DATE,"
                    +"nation VARCHAR(15),"
                    +"nid BIGINT not null,"
                    +"name VARCHAR(30),"
                    +"p_number VARCHAR(14),"
                    +"dob DATE,"
                    +"address VARCHAR(50),"
                    +"PRIMARY KEY(id)"
                    +")");

            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001000', 'passpass','Student','2017-01-10','Bangladeshi','1111111100','Md. Abdullah','01710000001','1995-01-02',' Bamnartek, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001000'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001001', 'passpass','Student','2017-01-10','Bangladeshi','1111111101','Md. Salam','01710000002','1996-01-02',' Uttara, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001001'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001002', 'passpass','Student','2017-01-10','Bangladeshi','1111111102','Md. Kalam','01710000003','1997-01-02',' Ranavola, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001002'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001003', 'passpass','Student','2017-01-10','Bangladeshi','1111111103','Md. Jobbar','01710000004','1998-01-02',' Uttara, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001003'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001004', 'passpass','Student','2017-01-10','Bangladeshi','1111111104','Md. Suzon mia','01710000004','1999-01-02',' Dhanmondi, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001004'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001005', 'passpass','Student','2017-01-10','Bangladeshi','1111111105','Md. Rasel Hosain','01710000005','1985-01-02',' Mirpur, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001005'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001006', 'passpass','Student','2017-01-10','Bangladeshi','1111111106','Md. Imam Hosain Roni','01710000006','1986-01-02',' Uttara, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001006'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001007', 'passpass','Student','2017-01-10','Bangladeshi','1111111107','Md. Anik Khan','01710000007','1987-01-02',' Banani, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001007'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '15103006', 'pass','Student','2017-01-10','Bangladeshi','3564322332','Mst. Bijori Hossain','01610550008','1996-01-02',' Uttara, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '15103006'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '15103049', 'pass','Student','2017-01-10','Bangladeshi','1111111109','Shaila Nasrin','01710000009','1989-01-02',' Airport, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '15103049'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001010', 'passpass','Student','2017-01-10','Bangladeshi','1111111110','Md. Azgor','01710000010','1990-01-02',' Uttara, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001010'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001011', 'passpass','Student','2017-01-10','Bangladeshi','1111111111','Md. Asadullah','01710000011','1982-01-02',' Uttara, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001011'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001012', 'passpass','Student','2017-01-10','Bangladeshi','1111111112','Md. Saad','01710000012','1995-01-02',' Uttara, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001012'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001013', 'passpass','Student','2017-01-10','Bangladeshi','1111111113','Md. Ludo','01710000013','1995-01-02',' Uttara, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001013'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001014', 'passpass','Student','2017-01-10','Bangladeshi','1111111114','Md. Biplop','01710000014','1995-01-02',' Uttara, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001014'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001015', 'passpass','Student','2017-01-10','Bangladeshi','1111111115','Md. Santo','01710000015','1995-01-02',' Kamarpara, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001015'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001016', 'passpass','Student','2017-01-10','Bangladeshi','1111111116','Md. Sawpan','01710000016','1995-01-02',' Comilla, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001016'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001017', 'passpass','Student','2017-01-10','Bangladeshi','1111111117','Md. Sazzadullah','01710000017','1995-01-02',' Uttara, Dhaka, Bangladesh') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001017'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001018', 'passpass','Student','2017-01-10','Bangladeshi','1111111118','Md. Ashraful Haque','01710000018','1995-01-02',' Uttara, Dhaka') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001018'" +")");
            stt.execute("INSERT INTO user (id,pass,ac_type,join_date,nation,nid,name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT '10001019', 'passpass','Student','2017-01-10','Bangladeshi','1111111119','Md. Asadullah','01710000019','1995-01-02',' Uttara, Dhaka') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM user WHERE id = '10001019'" +")");
            
//money table and insert
             stt.execute("CREATE TABLE IF NOT EXISTS money("
                    +"id VARCHAR(15) not null,"
                    +"name VARCHAR(30) not null,"
                    +"amount BIGINT(12),"
                    +"PRIMARY KEY(id)"
                    +")");
                        
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001000','Md. Abdullah','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001000'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001001','Md. Salam','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001001'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001002','Md. Kalam','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001002'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001003','Md. Jobbar','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001003'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001004','Md. Suzon mia','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001004'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001005','Md. Rasel Hosain','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001005'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001006','Md. Imam Hosain Roni','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001006'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001007','Md. Anik Khan','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001007'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '15103006','Mst. Bijori Hossain','3606000') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '15103006'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '15103049','Mst. Shaila Nasrin','10002') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '15103049'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001010','Md. Azgor','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001010'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001011','Md. Asadullah','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001011'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001012','Md. Sadd','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001012'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001013','Md. Ludo','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001013'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001014','Md. Biplop','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001014'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001015','Md. Santo','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001015'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001016','Md. Sawpan','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001016'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001017','Md. Sazzadullah','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001017'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001018','Md. Ashraful Haque','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001018'" +")");
            stt.execute("INSERT INTO money (id,name,amount)"
                        +"SELECT * FROM (SELECT '10001019','Md. Asadullah','0') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM money WHERE id = '10001019'" +")");
             
            
 
            
              stt.execute("CREATE TABLE IF NOT EXISTS history("
                    +"id VARCHAR(15) not null,"
                    +"amount BIGINT(12) not null,"
                    +"date date not null,"
                    +"purpose VARCHAR(20) not null,"
                    +"t_to_id VARCHAR(20)"
                    +")");
              
               stt.execute("INSERT INTO history (id,amount, date, purpose)"
                        +"SELECT * FROM (SELECT '15103006','3608000', '2017-04-05', 'Deposit') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM history WHERE id = '15103006'" +")");
               stt.execute("INSERT INTO history (id,amount, date, purpose)"
                        +"SELECT * FROM (SELECT '10001000','493', '2017-04-05', 'Deposit') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM history WHERE id = '10001000'" +")");
               stt.execute("INSERT INTO history (id,amount, date, purpose)"
                        +"SELECT * FROM (SELECT '10001001','3467', '2017-04-05', 'Deposit') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM history WHERE id = '10001001'" +")");
               stt.execute("INSERT INTO history (id,amount, date, purpose,t_to_id)"
                        +"SELECT * FROM (SELECT '15103006','2000', '2017-04-05', 'transfer','100010002') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM history WHERE id = '15103006' and t_to_id='10001002'"+")");
               stt.execute("INSERT INTO history (id,amount, date, purpose,t_to_id)"
                        +"SELECT * FROM (SELECT '15103006','20030', '2017-04-05', 'transfer','100010005') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM history WHERE id = '15103006' and t_to_id='10001005'"+")");
               stt.execute("INSERT INTO history (id,amount, date, purpose)"
                        +"SELECT * FROM (SELECT '15103006','2000', '2017-04-05', 'Withdraw') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM history WHERE id = '15103006' and purpose='Withdraw'"+")");
             
             
            //admin section   ..................................//
             stt.execute("CREATE TABLE IF NOT EXISTS admin("
                    +"id VARCHAR(15) not null,"
                    +"pass VARCHAR(20) not null,"
                    +"name VARCHAR(30),"
                    +"p_number VARCHAR(12),"
                    +"PRIMARY KEY(id)"
                    +")");
             
             stt.execute("INSERT INTO admin (id,pass, name, p_number)"
                        +"SELECT * FROM (SELECT 'admin','pass', 'Md. Abdullah', '01738868597') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM admin WHERE id = 'admin'" +")");
             
             //Executive section ....................................//
              stt.execute("CREATE TABLE IF NOT EXISTS executive("
                    +"id VARCHAR(15) not null,"
                    +"pass VARCHAR(15) not null,"
                    +"join_date DATE,"
                    +"nation VARCHAR(15),"
                    +"nid BIGINT not null,"
                    +"designation VARCHAR(25),"
                    +"name VARCHAR(30),"
                    +"p_number VARCHAR(14),"
                    +"dob DATE,"
                    +"address VARCHAR(50),"
                    +"PRIMARY KEY(id)"
                    +")");
              stt.execute("INSERT INTO executive (id,pass,join_date,nation, nid,designation, name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT 'EX1000','passpass','2016-1-12','Bangladeshi', '21221311','Ass. Manager', 'MD. Harisul Islam','01765434343','1980-12-3','Uttara Dhaka-1230') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM executive WHERE id = 'EX1000'" +")");
              stt.execute("INSERT INTO executive (id,pass,join_date,nation, nid,designation, name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT 'EX001','passpass','2015-2-12','Bangladeshi', '212213211','Manager', 'MD. Abdullah','01738868597','1995-1-10','Uttara Dhaka-1230') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM executive WHERE id = 'EX001'" +")");
              stt.execute("INSERT INTO executive (id,pass,join_date,nation, nid,designation, name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT 'EX1001','passpass','2016-3-12','Bangladeshi', '19021311','Cashier', 'MD. Rasel Hosain','01665434343','1970-12-3','Mirpur Dhaka-1230') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM executive WHERE id = 'EX1001'" +")");
              stt.execute("INSERT INTO executive (id,pass,join_date,nation, nid,designation, name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT 's15103056','pass','2016-1-12','Bangladeshi', '323453222','Cashier', 'Saad','01615434343','1995-2-1','Uttara Dhaka-1230') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM executive WHERE id = 's15103056'" +")");
              stt.execute("INSERT INTO executive (id,pass,join_date,nation, nid,designation, name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT 'EX1003','passpass','2016-1-12','Bangladeshi', '99221311','Loan Officer', 'Mst. Bijori Islam','01805434343','1980-12-3','Bamnartek Dhaka-1230') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM executive WHERE id = 'EX1003'" +")");
              stt.execute("INSERT INTO executive (id,pass,join_date,nation, nid,designation, name,p_number,dob,address)"
                        +"SELECT * FROM (SELECT 'EX1004','passpass','2016-1-12','Bangladeshi', '78221311','Chief Financial Officer', 'MD. Habib Islam','01765434343','1980-12-3','Uttara Dhaka-1230') AS tmp WHERE NOT EXISTS ("+"SELECT id FROM executive WHERE id = 'EX1004'" +")");
              
             
             
            stt.close();
            conn.close();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
}
