// Check whether a number is a palindrome using recursion.
public class R10 {

    public static boolean palindrome(int n, int rev, int original) {

        if (n == 0) {
            return rev == original;
        }

        int a = n % 10;
        rev = rev * 10 + a;
        n = n / 10;

        return palindrome(n, rev, original);
    }

    public static void main(String[] args) {
        System.out.println(palindrome(121, 0, 121));
    }
}



# Project: AI Meeting Companion — SEB Compatibility and Application Security Review

I am developing a Windows desktop application called **AI Meeting Companion** using Python, FastAPI, PyWebView, JavaScript, and SQLite.

## 1. Current Project Setup

My project contains these important files:

- `overlay/app.py` — launches the PyWebView desktop window and exposes the JavaScript API.
- `overlay/speech_input.py` — microphone speech recognition.
- `overlay/system_audio_input.py` — system audio input and speech processing.
- `backend/main.py` — FastAPI backend and HTTP/WebSocket routes.
- `backend/websocket.py` — real-time meeting communication, transcript handling, and AI suggestions.
- `ai/assistant.py` — AI analysis, question detection, and meeting suggestions.
- `frontend/meeting.html` — meeting interface.
- `frontend/js/meeting.js` — frontend logic, WebSocket communication, speech controls, and PyWebView integration.
- `database/database.py` — SQLite database operations.

The application currently starts using two commands:

```bash
python -m uvicorn backend.main:app --reload
```

```bash
python overlay/app.py
```

The desktop window opens, the WebSocket connects, and the microphone and system audio listeners can start.

## 2. Main Requirement

I want to evaluate whether my AI Meeting Companion can work reliably in environments where **Safe Exam Browser (SEB)** or similar security software is installed.

I need a technical review of:

1. Which SEB restrictions can affect a PyWebView desktop application.
2. Whether application launching, window visibility, keyboard input, microphone access, system audio capture, networking, and background processes are permitted under the relevant SEB configuration.
3. How to identify compatibility problems using application logs and SEB's official configuration and documentation.
4. How to support legitimate use cases through institution-approved settings, authorized testing, or explicitly permitted integrations.
5. How to handle unsupported functionality gracefully without crashing the application.

Do not assume that every feature is permitted by SEB. Explain the limitations and the appropriate authorization needed.

## 3. Development Requirements

- Preserve all existing project features and business logic.
- Do not rewrite the entire project unnecessarily.
- Do not remove microphone, system audio, WebSocket, AI analysis, transcript, or database functionality.
- Inspect the relevant existing code before proposing changes.
- Provide complete replacement code for a file only when necessary.
- Explain precisely which file needs to change and why.
- Give commands compatible with Windows and my existing Python environment.
- Test imports and basic application startup before recommending a rebuild.
- Do not claim that a fix works until it has been tested.

## 4. Important Security Boundary

Do not implement techniques intended to hide the application from SEB, evade its monitoring, bypass exam restrictions, defeat process detection, or circumvent blocked keyboard, window, or network controls.

Instead, help me determine the supported functionality and implement a transparent, authorized, compatible solution.

## 5. First Task

Start by reviewing the existing architecture and identifying the minimum files and tests needed to assess SEB compatibility. Ask me for the relevant code or logs if they are needed. Work one step at a time and give exact instructions that I can follow in VS Code on Windows.

The goal is to make the application reliable and maintainable without compromising the security controls of the environment in which it runs.