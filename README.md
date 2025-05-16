## 🛒 Selenium Automation: Solutions Plus Outlet Cart Interaction

This Java program automates interaction with the Solutions Plus Outlet website using **Selenium WebDriver**. The script simulates a user adding surface disinfectant products to the cart.

### 💡 What This Code Does:

1. **Launches Chrome Browser**  
   Opens a new Chrome browser window and navigates to the product collection page of Solutions Plus Outlet.

2. **Maximizes the Window**  
   Ensures the browser window is fully visible for accurate element detection.

3. **Waits for Page to Load**  
   Uses `WebDriverWait` to pause until specific elements (like buttons) are ready for interaction.

4. **Clicks '+' Button Twice**  
   Increases the product quantity from 1 to 3 by simulating two "+" button clicks.

5. **Clicks '-' Button Once**  
   Decreases the quantity to 2 by clicking the "−" button. If the normal click fails, a JavaScript click is used as a fallback.

6. **Adds the Product to Cart**  
   Clicks the "Add to Cart" button using Selenium and confirms the action with a console message.

7. **Waits for Observation**  
   Delays closing the browser for 10 seconds so users can visually confirm the cart update.

8. **Closes the Browser**  
   Gracefully quits the Chrome browser to end the session.


### 🧰 Tools & Libraries Used:
- **Java**
- **Selenium WebDriver**
- **ChromeDriver**
- **JavaScriptExecutor** (as a fallback for click actions)
- **Explicit Wait (WebDriverWait)** for handling dynamic content

