# Railway Management System

This is a simple console-based Railway Management System developed in Java. It allows users to book tickets, cancel bookings, view booked tickets, and check available berths.

---

## Features

* **Book Tickets**: Passengers can book tickets with preferred berth choices (Upper, Middle, Lower). If the preferred berth is not available, the system attempts to assign another available berth. If all regular berths are full, it allocates RAC (Reservation Against Cancellation) or Waiting List (WL) tickets.
* **Cancel Tickets**: Passengers can cancel their booked tickets using their unique ticket ID.
* **View Booked Tickets**: Displays a list of all currently booked tickets, including RAC and Waiting List passengers.
* **View Available Tickets**: (Currently not fully implemented, see "Future Enhancements")
* **Menu-driven Interface**: Easy to navigate through different options.

---

## How to Run

1.  **Prerequisites**: Make sure you have the Java Development Kit (JDK) installed on your system.
2.  **Compile**:
    Open a terminal or command prompt, navigate to the directory where you saved `Railway_Management.java` and `Person.java`, and compile the code:
    ```bash
    javac Railway_Management.java
    ```
3.  **Run**:
    After successful compilation, run the application using:
    ```bash
    java Railway_Management
    ```

---

## Project Structure

* `Person.java`: Defines the `Person` class, representing a passenger with properties like name, age, berth preference, and ticket ID.
* `Railway_Management.java`: Contains the main logic for the railway management system, including booking, cancellation, and viewing functionalities.

---

## Current Limitations & Future Enhancements

* **Berth Assignment Logic**: The current booking logic for preferred berths could be more robust. For instance, if an 'Upper' berth is requested but not available, the system currently tries 'Middle' then 'Lower' without specifically assigning the *next best* available preferred berth type.
* **RAC/Waiting List Upgrades**: When a ticket is cancelled, the system tries to upgrade RAC passengers to confirmed berths and Waiting List passengers to RAC, but the logic might need refinement to ensure the correct berth type (U, M, L) is assigned based on availability and preference.
* **`viewavail` Functionality**: The `viewavail` method currently prints the `availlist` object directly, which will show memory addresses. It needs to be updated to display the actual count of available berths for each type (Upper, Middle, Lower, RAC, WL).
* **Error Handling**: Basic error handling is present (e.g., for invalid menu choices), but more comprehensive validation for user inputs (e.g., age, berth choice) could be added.
* **Data Persistence**: Bookings are lost when the program exits. Implementing data persistence (e.g., saving to a file) would make the system more practical.
* **Unique Ticket IDs**: The `id` variable is incremented in `booking` but not used to ensure unique IDs across all lists (booked, RAC, WL).
* **Clarity in Ticket Counts**: The `tickets` ArrayList uses indices (0 for Upper, 1 for Middle, etc.) which is functional but could be made more readable using an `Enum` or constants.

---

## Contributing

Feel free to fork this repository and submit pull requests. Any contributions, bug fixes, or feature enhancements are welcome!

