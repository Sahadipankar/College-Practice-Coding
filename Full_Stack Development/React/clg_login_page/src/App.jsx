import React, { useState } from 'react';

const App = () => {
  const [isLogin, setIsLogin] = useState(true);
  const [formHover, setFormHover] = useState(false);
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');
  const [signupEmail, setSignupEmail] = useState('');
  const [signupPassword, setSignupPassword] = useState('');
  const [signupConfirm, setSignupConfirm] = useState('');
  const [signupError, setSignupError] = useState('');

  const handleLogin = (e) => {
    e.preventDefault();
    if (!email || !password) {
      setError('Please enter both email and password.');
      return;
    }
    setError('');
    alert(`Logged in as ${email}`);
  };

  const handleSignup = (e) => {
    e.preventDefault();
    if (!signupEmail || !signupPassword || !signupConfirm) {
      setSignupError('Please fill all fields.');
      return;
    }
    if (signupPassword !== signupConfirm) {
      setSignupError('Passwords do not match.');
      return;
    }
    setSignupError('');
    alert(`Account created for ${signupEmail}`);
    setIsLogin(true);
    setSignupEmail('');
    setSignupPassword('');
    setSignupConfirm('');
  };

  return (
    <div className={`auth-bg${formHover ? ' faded-bg' : ''}`}>
      {isLogin ? (
        <form
          onSubmit={handleLogin}
          className={`auth-form${formHover ? ' opaque-form' : ''}`}
          onMouseEnter={() => setFormHover(true)}
          onMouseLeave={() => setFormHover(false)}
        >
          <h2 className="auth-title">Login</h2>
          <div className="auth-field">
            <label htmlFor="email" className="auth-label">Email</label>
            <input
              type="email"
              id="email"
              value={email}
              onChange={e => setEmail(e.target.value)}
              className="auth-input"
              required
            />
          </div>
          <div className="auth-field">
            <label htmlFor="password" className="auth-label">Password</label>
            <input
              type="password"
              id="password"
              value={password}
              onChange={e => setPassword(e.target.value)}
              className="auth-input"
              required
            />
          </div>
          {error && <div className="auth-error">{error}</div>}
          <button type="submit" className="auth-btn">Login</button>
          <div className="auth-switch">
            <span>Don't have an account? </span>
            <button type="button" className="auth-link" onClick={() => setIsLogin(false)}>Sign Up</button>
          </div>
        </form>
      ) : (
        <form
          onSubmit={handleSignup}
          className={`auth-form${formHover ? ' opaque-form' : ''}`}
          onMouseEnter={() => setFormHover(true)}
          onMouseLeave={() => setFormHover(false)}
        >
          <h2 className="auth-title">Sign Up</h2>
          <div className="auth-field">
            <label htmlFor="signupEmail" className="auth-label">Email</label>
            <input
              type="email"
              id="signupEmail"
              value={signupEmail}
              onChange={e => setSignupEmail(e.target.value)}
              className="auth-input"
              required
            />
          </div>
          <div className="auth-field">
            <label htmlFor="signupPassword" className="auth-label">Password</label>
            <input
              type="password"
              id="signupPassword"
              value={signupPassword}
              onChange={e => setSignupPassword(e.target.value)}
              className="auth-input"
              required
            />
          </div>
          <div className="auth-field">
            <label htmlFor="signupConfirm" className="auth-label">Confirm Password</label>
            <input
              type="password"
              id="signupConfirm"
              value={signupConfirm}
              onChange={e => setSignupConfirm(e.target.value)}
              className="auth-input"
              required
            />
          </div>
          {signupError && <div className="auth-error">{signupError}</div>}
          <button type="submit" className="auth-btn">Sign Up</button>
          <div className="auth-switch">
            <span>Already have an account? </span>
            <button type="button" className="auth-link" onClick={() => setIsLogin(true)}>Login</button>
          </div>
        </form>
      )}
    </div>
  );
};

export default App;