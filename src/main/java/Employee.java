class Employee

        {

            // declare the variable fields

            private String name;

            private int id_number;

            private String depart;

            private String position;

         

            // create a Constructors

public Employee(String nml, int idNumber, String department, String positions)

            {

                name = nml;

                id_number = idNumber;

                depart = department;

                position = positions;

            }

         

            public Employee(String nm, int idNumber)

            {

                name = nm;

                id_number = idNumber;

                depart = " ";

                position = " ";

            }

         

            public Employee()

            {

                name = " ";

                id_number = 0;

                depart = " ";

                position = " ";

            }

         

            // create a Methods

           public String get_Name()

            {

                return name;

            }

         

            public int getid_number()

            {

                return id_number;

            }

         

            public String getdepart()

            {

                return depart;

            }

     

        public String get_Position()

        {

            return position;

        }

             

        }

