
  - Project Name : Midbrain Academy - Website Automation Testing

1. Introduction
This Test Plan is designed to verify the functionality and user interface of the MidBrains Technologies website. The goal is to ensure that all functional areas, navigation links, and forms work as expected using automated testing scripts.

2. Scope of Testing
Functional areas to cover :
 - Home Page: Verification of successful page load, title, and URL.
 -  Navigation Menu: Testing all links for proper redirection.
 - Course Pages: Validating details for MERN, Testing, and other course pages.
 - Forms: Functional testing of the Contact Form and Enquiry/Lead Form.
 - Buttons & CTA: Ensuring "Send Email" and call-to-action buttons trigger the correct actions.

What We Will Not Test (Out of Scope):
 - Backend database validation.
 - Performance/Load testing (High traffic simulation).
 - API integration (Unless specified in the code).

3. Automation Strategy
 - Automation Tool: Selenium (Java/Python/JS) or Playwright (Preferred as per requirement).
 - Framework: Page Object Model (POM) for better maintainability.
 - Folder Structure: Organized structure with separate folders for Page Classes, Test Scripts, and Utilities.
 - Synchronization: Use of explicit waits for element visibility and stability.
 - Assertions: Use of hard/soft assertions to verify expected results.

4. Test Scenarios (Must Automate)
 - Homepage Validation: Verify page loads, validate title & URL, and check visibility of main sections.
 - Navigation Testing: Click all menu items and verify they lead to the correct pages.
 - Training Page Testing: Open training pages and verify details (Title, Description, Buttons).
 - Contact Form Testing: * Enter valid data \rightarrow Send Email \rightarrow Success Message.
   - Enter invalid data \rightarrow Check for Validation Errors.
 - Button Click Flow: Verify the "Send Email" flow opens the correct form or triggers the intended redirection.

5. Environment & Devices
 - Desktop: Chrome Browser (Latest Version).
 - Mobile: Responsive testing on mobile devices (e.g., Redmi Note 11T 5G).
 - Operating System: Windows/macOS.

6. Deliverables
As per the requirement, the following will be submitted:
 - Automation Code: GitHub Repository link with clean code.
 - Test Case Document: Detailed Excel or PDF file.
 - Bug Report: Documentation of any defects found during testing.
 - Execution Video: Screen recording of the automated script running.
 - README File: Step-by-step instructions for project setup.

7. Bug Reporting Format
Any found defects will be reported using:
 - Bug ID
 - Title
 - Steps to Reproduce
 - Expected Result vs. Actual Result
 - Screenshot/Video Link
 - Severity: Low / Medium / High

8. Timeline
 - Submission Deadline: 5 Days.
