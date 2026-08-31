const toggle = document.getElementById('theme-toggle');
const root = document.documentElement;

const sunIcon = `<circle cx="12" cy="12" r="5"/><path d="M12 1v2M12 21v2M4.2 4.2l1.4 1.4M18.4 18.4l1.4 1.4M1 12h2M21 12h2M4.2 19.8l1.4-1.4M18.4 5.6l1.4-1.4"/>`;
const moonIcon = `<path d="M21 12.5A8.5 8.5 0 1 1 11.5 3 7 7 0 0 0 21 12.5z"/>`;

function updateIcon() {
    const isDark = root.getAttribute('data-theme') === 'dark';
    toggle.querySelector('svg').innerHTML = isDark ? moonIcon : sunIcon;
}

const saved = localStorage.getItem('theme');
if (saved === 'dark') {
    root.setAttribute('data-theme', 'dark');
}
updateIcon();

toggle.addEventListener('click', () => {
    const isDark = root.getAttribute('data-theme') === 'dark';
    if (isDark) {
        root.removeAttribute('data-theme');
        localStorage.setItem('theme', 'light');
    } else {
        root.setAttribute('data-theme', 'dark');
        localStorage.setItem('theme', 'dark');
    }
    updateIcon();
});