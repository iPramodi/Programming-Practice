import numpy as np
import matplotlib.pyplot as plt
from scipy import signal

# Generate a clean signal
t = np.linspace(0, 1, 1000)
x = np.sin(2 * np.pi * 50 * t)

# Add Gaussian noise
noise = np.random.randn(len(t))
x_noisy = x + noise

# Design a low-pass filter
fs = 1000  # Sampling frequency
cutoff_freq = 100  # Cutoff frequency
b, a = signal.butter(4, cutoff_freq / (fs / 2), 'lowpass')

# Filter the noisy signal
x_filtered = signal.filtfilt(b, a, x_noisy)

# Plot the signals
plt.figure(figsize=(10, 6))
plt.subplot(3, 1, 1)
plt.plot(t, x)
plt.title('Original Signal')

plt.subplot(3, 1, 2)
plt.plot(t, x_noisy)
plt.title('Noisy Signal')

plt.subplot(3, 1, 3)
plt.plot(t, x_filtered)
plt.title('Filtered Signal')

plt.tight_layout()
plt.show()